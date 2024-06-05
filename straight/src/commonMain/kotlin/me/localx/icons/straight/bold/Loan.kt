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

public val Icons.Bold.Loan: ImageVector
    get() {
        if (_loan != null) {
            return _loan!!
        }
        _loan = Builder(name = "Loan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.732f, 9.013f)
                curveToRelative(-0.768f, -0.699f, -1.765f, -1.054f, -2.797f, -1.008f)
                curveToRelative(-1.036f, 0.048f, -1.991f, 0.498f, -2.69f, 1.265f)
                lineToRelative(-2.438f, 2.679f)
                curveToRelative(-0.073f, -0.066f, -0.157f, -0.118f, -0.235f, -0.178f)
                curveToRelative(0.265f, -0.533f, 0.428f, -1.125f, 0.428f, -1.759f)
                curveToRelative(0.0f, -3.214f, -2.514f, -6.265f, -5.428f, -6.889f)
                curveToRelative(0.678f, -0.687f, 1.428f, -1.754f, 1.428f, -3.123f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0.0f, 1.166f, 0.848f, 2.329f, 1.557f, 3.099f)
                curveToRelative(-2.968f, 0.56f, -5.557f, 3.651f, -5.557f, 6.913f)
                curveToRelative(0.0f, 0.435f, 0.088f, 0.847f, 0.218f, 1.239f)
                curveToRelative(-1.296f, 0.514f, -2.218f, 1.773f, -2.218f, 3.249f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11.181f)
                lineToRelative(8.334f, -9.532f)
                curveToRelative(1.41f, -1.581f, 1.283f, -4.027f, -0.282f, -5.455f)
                close()
                moveTo(8.5f, 6.0f)
                curveToRelative(1.668f, 0.0f, 3.5f, 2.1f, 3.5f, 4.012f)
                curveToRelative(0.0f, 0.545f, -0.448f, 0.988f, -1.0f, 0.988f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.443f, -1.0f, -0.988f)
                curveToRelative(0.0f, -1.912f, 1.832f, -4.012f, 3.5f, -4.012f)
                close()
                moveTo(20.767f, 12.482f)
                lineToRelative(-7.447f, 8.518f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.857f)
                curveToRelative(0.354f, 0.0f, 0.643f, 0.288f, 0.643f, 0.642f)
                curveToRelative(0.0f, 0.317f, -0.237f, 0.591f, -0.551f, 0.636f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.424f, 2.97f)
                lineToRelative(5.162f, -0.737f)
                curveToRelative(1.618f, -0.231f, 2.875f, -1.531f, 3.093f, -3.115f)
                lineToRelative(3.497f, -3.843f)
                curveToRelative(0.159f, -0.175f, 0.376f, -0.277f, 0.612f, -0.288f)
                curveToRelative(0.231f, -0.012f, 0.463f, 0.071f, 0.636f, 0.229f)
                curveToRelative(0.356f, 0.325f, 0.385f, 0.881f, 0.055f, 1.252f)
                close()
            }
        }
        .build()
        return _loan!!
    }

private var _loan: ImageVector? = null
