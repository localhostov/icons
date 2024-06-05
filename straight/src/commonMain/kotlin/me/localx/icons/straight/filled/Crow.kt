package me.localx.icons.straight.filled

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

public val Icons.Filled.Crow: ImageVector
    get() {
        if (_crow != null) {
            return _crow!!
        }
        _crow = Builder(name = "Crow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.659f, 15.0f)
                reflectiveCurveToRelative(7.112f, -8.87f, 7.341f, -9.309f)
                verticalLineToRelative(3.871f)
                curveToRelative(0.0f, 2.998f, -2.376f, 5.438f, -5.298f, 5.438f)
                horizontalLineToRelative(-2.043f)
                close()
                moveTo(22.0f, 3.524f)
                curveToRelative(0.0f, -0.008f, 0.0f, -0.016f, 0.0f, -0.024f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
                verticalLineToRelative(6.062f)
                curveToRelative(0.0f, 4.101f, -3.274f, 7.438f, -7.298f, 7.438f)
                horizontalLineToRelative(-3.641f)
                lineTo(0.052f, 22.017f)
                lineToRelative(1.562f, 1.248f)
                lineToRelative(1.809f, -2.265f)
                horizontalLineToRelative(5.438f)
                lineToRelative(1.5f, 3.0f)
                horizontalLineToRelative(2.236f)
                lineToRelative(-1.531f, -3.062f)
                curveToRelative(0.855f, -0.093f, 1.684f, -0.29f, 2.476f, -0.576f)
                lineToRelative(1.819f, 3.638f)
                horizontalLineToRelative(2.236f)
                lineToRelative(-2.243f, -4.487f)
                curveToRelative(3.341f, -1.949f, 5.645f, -5.604f, 5.645f, -9.685f)
                curveToRelative(0.0f, 0.0f, 0.002f, -2.795f, 0.005f, -2.828f)
                horizontalLineToRelative(2.995f)
                curveToRelative(0.0f, -1.892f, -1.085f, -2.934f, -2.0f, -3.476f)
                close()
            }
        }
        .build()
        return _crow!!
    }

private var _crow: ImageVector? = null
