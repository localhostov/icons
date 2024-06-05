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

public val Icons.Bold._9: ImageVector
    get() {
        if (__9 != null) {
            return __9!!
        }
        __9 = Builder(name = "_9", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.996f, 8.0f)
                curveTo(19.862f, 3.744f, 16.483f, 0.185f, 12.351f, 0.008f)
                curveToRelative(-2.154f, -0.099f, -4.205f, 0.66f, -5.782f, 2.119f)
                curveToRelative(-1.578f, 1.46f, -2.488f, 3.445f, -2.563f, 5.591f)
                curveToRelative(-0.073f, 2.103f, 0.737f, 4.207f, 2.225f, 5.771f)
                curveToRelative(1.484f, 1.562f, 3.54f, 2.477f, 5.64f, 2.511f)
                curveToRelative(1.914f, 0.016f, 3.681f, -0.587f, 5.131f, -1.753f)
                verticalLineToRelative(1.254f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.499f, -5.5f, 5.499f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(3.001f)
                horizontalLineToRelative(5.5f)
                curveToRelative(4.687f, -0.001f, 8.5f, -3.814f, 8.5f, -8.5f)
                lineToRelative(-0.004f, -7.5f)
                close()
                moveTo(12.0f, 13.005f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.239f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.239f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return __9!!
    }

private var __9: ImageVector? = null
