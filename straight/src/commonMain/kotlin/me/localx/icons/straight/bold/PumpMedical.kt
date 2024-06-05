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

public val Icons.Bold.PumpMedical: ImageVector
    get() {
        if (_pumpMedical != null) {
            return _pumpMedical!!
        }
        _pumpMedical = Builder(name = "PumpMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.738f, 3.0f)
                curveToRelative(0.297f, 0.0f, 0.585f, 0.087f, 0.832f, 0.252f)
                lineToRelative(2.502f, 1.668f)
                lineToRelative(1.664f, -2.496f)
                lineToRelative(-2.503f, -1.669f)
                curveToRelative(-0.742f, -0.494f, -1.605f, -0.755f, -2.495f, -0.755f)
                horizontalLineToRelative(-6.238f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.513f)
                curveToRelative(-3.555f, 1.258f, -6.0f, 4.685f, -6.0f, 8.487f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -3.802f, -2.445f, -7.228f, -6.0f, -8.487f)
                verticalLineToRelative(-2.013f)
                horizontalLineToRelative(3.738f)
                close()
                moveTo(18.0f, 13.5f)
                verticalLineToRelative(7.5f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -2.389f, 1.448f, -4.556f, 3.598f, -5.5f)
                horizontalLineToRelative(4.804f)
                curveToRelative(2.15f, 0.944f, 3.598f, 3.111f, 3.598f, 5.5f)
                close()
                moveTo(13.5f, 13.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _pumpMedical!!
    }

private var _pumpMedical: ImageVector? = null
