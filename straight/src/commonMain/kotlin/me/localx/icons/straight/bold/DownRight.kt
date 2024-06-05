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

public val Icons.Bold.DownRight: ImageVector
    get() {
        if (_downRight != null) {
            return _downRight!!
        }
        _downRight = Builder(name = "DownRight", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.05f, 23.0f)
                lineToRelative(5.35f, -5.49f)
                lineTo(0.7f, 7.82f)
                lineTo(7.82f, 0.7f)
                lineToRelative(9.69f, 9.69f)
                lineToRelative(5.49f, -5.33f)
                verticalLineToRelative(14.53f)
                curveToRelative(0.0f, 0.91f, -0.36f, 1.76f, -1.0f, 2.41f)
                curveToRelative(-0.64f, 0.64f, -1.5f, 1.0f, -2.41f, 1.0f)
                lineTo(5.05f, 23.0f)
                close()
                moveTo(4.95f, 7.83f)
                lineToRelative(9.66f, 9.66f)
                lineToRelative(-2.45f, 2.51f)
                horizontalLineToRelative(7.43f)
                curveToRelative(0.14f, 0.0f, 0.23f, -0.07f, 0.29f, -0.12f)
                curveToRelative(0.05f, -0.05f, 0.12f, -0.15f, 0.12f, -0.28f)
                verticalLineToRelative(-7.43f)
                reflectiveCurveToRelative(-2.51f, 2.44f, -2.51f, 2.44f)
                lineTo(7.82f, 4.94f)
                lineToRelative(-2.88f, 2.88f)
                close()
            }
        }
        .build()
        return _downRight!!
    }

private var _downRight: ImageVector? = null
