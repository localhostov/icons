package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.TrashCanCheck: ImageVector
    get() {
        if (_trashCanCheck != null) {
            return _trashCanCheck!!
        }
        _trashCanCheck = Builder(name = "TrashCanCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 4.0f)
                horizontalLineToRelative(-3.101f)
                curveToRelative(-0.465f, -2.279f, -2.484f, -4.0f, -4.899f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.414f, 0.0f, -4.434f, 1.721f, -4.899f, 4.0f)
                horizontalLineToRelative(-3.101f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.302f, 0.0f, 2.402f, 0.839f, 2.816f, 2.0f)
                horizontalLineToRelative(-7.631f)
                curveToRelative(0.414f, -1.161f, 1.514f, -2.0f, 2.816f, -2.0f)
                close()
                moveTo(16.23f, 13.229f)
                lineToRelative(-3.046f, 2.867f)
                curveToRelative(-0.569f, 0.562f, -1.325f, 0.844f, -2.084f, 0.844f)
                reflectiveCurveToRelative(-1.522f, -0.283f, -2.104f, -0.852f)
                lineToRelative(-1.186f, -1.041f)
                curveToRelative(-0.415f, -0.365f, -0.455f, -0.997f, -0.091f, -1.411f)
                curveToRelative(0.367f, -0.415f, 0.998f, -0.455f, 1.411f, -0.091f)
                lineToRelative(1.225f, 1.077f)
                curveToRelative(0.427f, 0.414f, 1.057f, 0.415f, 1.44f, 0.033f)
                lineToRelative(3.062f, -2.884f)
                curveToRelative(0.402f, -0.377f, 1.034f, -0.359f, 1.414f, 0.043f)
                curveToRelative(0.378f, 0.402f, 0.359f, 1.035f, -0.043f, 1.414f)
                close()
            }
        }
        .build()
        return _trashCanCheck!!
    }

private var _trashCanCheck: ImageVector? = null
