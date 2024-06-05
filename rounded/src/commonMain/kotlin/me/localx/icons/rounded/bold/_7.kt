package me.localx.icons.rounded.bold

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

public val Icons.Bold._7: ImageVector
    get() {
        if (__7 != null) {
            return __7!!
        }
        __7 = Builder(name = "_7", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.499f, 24.0f)
                curveToRelative(-0.252f, 0.0f, -0.508f, -0.064f, -0.743f, -0.198f)
                curveToRelative(-0.719f, -0.411f, -0.969f, -1.327f, -0.558f, -2.046f)
                lineTo(16.918f, 3.0f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11.605f)
                curveToRelative(1.01f, 0.0f, 1.93f, 0.513f, 2.461f, 1.373f)
                reflectiveCurveToRelative(0.578f, 1.912f, 0.126f, 2.814f)
                lineTo(8.802f, 23.244f)
                curveToRelative(-0.277f, 0.485f, -0.783f, 0.756f, -1.304f, 0.756f)
                close()
            }
        }
        .build()
        return __7!!
    }

private var __7: ImageVector? = null
