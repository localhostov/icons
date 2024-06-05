package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.UpLeft: ImageVector
    get() {
        if (_upLeft != null) {
            return _upLeft!!
        }
        _upLeft = Builder(name = "UpLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.18f, 23.3f)
                lineTo(6.48f, 13.61f)
                lineTo(1.0f, 18.94f)
                verticalLineTo(4.41f)
                curveToRelative(0.0f, -0.91f, 0.36f, -1.76f, 1.0f, -2.41f)
                curveToRelative(0.64f, -0.64f, 1.5f, -1.0f, 2.4f, -1.0f)
                horizontalLineToRelative(14.55f)
                reflectiveCurveToRelative(-5.34f, 5.48f, -5.34f, 5.48f)
                lineToRelative(9.69f, 9.69f)
                lineToRelative(-7.12f, 7.12f)
                close()
                moveTo(6.52f, 9.39f)
                lineToRelative(9.66f, 9.66f)
                lineToRelative(2.88f, -2.88f)
                lineTo(9.39f, 6.51f)
                lineToRelative(2.45f, -2.51f)
                horizontalLineTo(4.41f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.14f, 0.0f, -0.23f, 0.06f, -0.29f, 0.12f)
                curveToRelative(-0.05f, 0.05f, -0.12f, 0.15f, -0.12f, 0.28f)
                verticalLineToRelative(7.43f)
                reflectiveCurveToRelative(2.51f, -2.44f, 2.51f, -2.44f)
                close()
            }
        }
        .build()
        return _upLeft!!
    }

private var _upLeft: ImageVector? = null
