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

public val Icons.Bold.DownLeft: ImageVector
    get() {
        if (_downLeft != null) {
            return _downLeft!!
        }
        _downLeft = Builder(name = "DownLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.95f, 23.0f)
                lineTo(4.4f, 23.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.91f, 0.0f, -1.76f, -0.35f, -2.4f, -1.0f)
                curveToRelative(-0.64f, -0.64f, -1.0f, -1.5f, -0.99f, -2.41f)
                lineTo(1.01f, 5.06f)
                reflectiveCurveToRelative(5.48f, 5.33f, 5.48f, 5.33f)
                lineTo(16.17f, 0.7f)
                lineToRelative(7.12f, 7.12f)
                lineToRelative(-9.69f, 9.69f)
                lineToRelative(5.34f, 5.49f)
                close()
                moveTo(4.4f, 20.0f)
                horizontalLineToRelative(7.43f)
                reflectiveCurveToRelative(-2.45f, -2.51f, -2.45f, -2.51f)
                lineTo(19.05f, 7.82f)
                lineToRelative(-2.88f, -2.88f)
                lineTo(6.51f, 14.61f)
                lineToRelative(-2.51f, -2.44f)
                verticalLineToRelative(7.43f)
                curveToRelative(0.0f, 0.14f, 0.07f, 0.23f, 0.12f, 0.29f)
                curveToRelative(0.05f, 0.05f, 0.15f, 0.12f, 0.28f, 0.12f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _downLeft!!
    }

private var _downLeft: ImageVector? = null
