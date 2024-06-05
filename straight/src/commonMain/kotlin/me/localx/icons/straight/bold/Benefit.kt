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

public val Icons.Bold.Benefit: ImageVector
    get() {
        if (_benefit != null) {
            return _benefit!!
        }
        _benefit = Builder(name = "Benefit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.732f, 9.013f)
                curveToRelative(-0.768f, -0.699f, -1.764f, -1.056f, -2.797f, -1.008f)
                curveToRelative(-1.036f, 0.048f, -1.992f, 0.498f, -2.69f, 1.265f)
                lineToRelative(-2.438f, 2.679f)
                curveToRelative(-0.646f, -0.589f, -1.507f, -0.949f, -2.449f, -0.949f)
                lineTo(3.5f, 11.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11.181f)
                lineToRelative(8.335f, -9.532f)
                curveToRelative(1.409f, -1.581f, 1.282f, -4.028f, -0.283f, -5.455f)
                close()
                moveTo(20.766f, 12.483f)
                lineToRelative(-7.447f, 8.518f)
                lineTo(3.5f, 21.001f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.858f)
                curveToRelative(0.354f, 0.0f, 0.642f, 0.288f, 0.642f, 0.643f)
                curveToRelative(0.0f, 0.317f, -0.237f, 0.591f, -0.551f, 0.635f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.424f, 2.971f)
                lineToRelative(5.16f, -0.737f)
                curveToRelative(1.619f, -0.231f, 2.877f, -1.53f, 3.095f, -3.116f)
                lineToRelative(3.497f, -3.843f)
                curveToRelative(0.159f, -0.175f, 0.376f, -0.277f, 0.612f, -0.288f)
                curveToRelative(0.23f, -0.01f, 0.463f, 0.071f, 0.636f, 0.229f)
                curveToRelative(0.356f, 0.325f, 0.385f, 0.882f, 0.055f, 1.252f)
                close()
                moveTo(13.999f, 8.001f)
                lineTo(3.0f, 8.001f)
                lineTo(3.0f, 0.0f)
                lineToRelative(2.75f, 3.0f)
                lineToRelative(2.75f, -3.0f)
                lineToRelative(2.75f, 3.0f)
                lineToRelative(2.75f, -3.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _benefit!!
    }

private var _benefit: ImageVector? = null
