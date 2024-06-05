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

public val Icons.Bold._6: ImageVector
    get() {
        if (__6 != null) {
            return __6!!
        }
        __6 = Builder(name = "_6", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.004f, 16.0f)
                curveToRelative(0.134f, 4.256f, 3.513f, 7.815f, 7.646f, 7.992f)
                curveToRelative(2.154f, 0.099f, 4.205f, -0.66f, 5.782f, -2.119f)
                curveToRelative(1.578f, -1.46f, 2.488f, -3.445f, 2.563f, -5.591f)
                curveToRelative(0.073f, -2.103f, -0.737f, -4.207f, -2.225f, -5.771f)
                curveToRelative(-1.484f, -1.562f, -3.54f, -2.477f, -5.64f, -2.511f)
                curveToRelative(-1.914f, -0.016f, -3.681f, 0.587f, -5.131f, 1.753f)
                verticalLineToRelative(-1.254f)
                curveToRelative(0.0f, -3.032f, 2.468f, -5.499f, 5.5f, -5.499f)
                horizontalLineToRelative(5.5f)
                lineTo(17.999f, 0.0f)
                horizontalLineToRelative(-5.5f)
                curveTo(7.813f, 0.001f, 4.0f, 3.814f, 4.0f, 8.5f)
                lineToRelative(0.004f, 7.5f)
                close()
                moveTo(12.0f, 10.995f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.239f, -5.0f, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return __6!!
    }

private var __6: ImageVector? = null
