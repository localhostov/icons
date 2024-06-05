package me.localx.icons.rounded.filled

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

public val Icons.Filled.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.896f, 13.749f)
                lineToRelative(-1.402f, -9.48f)
                curveToRelative(-0.359f, -2.434f, -2.486f, -4.269f, -4.946f, -4.269f)
                horizontalLineToRelative(-1.548f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.548f)
                curveToRelative(1.476f, 0.0f, 2.752f, 1.101f, 2.968f, 2.562f)
                lineToRelative(1.248f, 8.438f)
                horizontalLineToRelative(-3.764f)
                curveToRelative(-1.629f, 0.0f, -3.065f, 0.795f, -3.978f, 2.004f)
                curveToRelative(-0.008f, 0.0f, -0.014f, -0.004f, -0.022f, -0.004f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.008f, 0.0f, -0.014f, 0.004f, -0.022f, 0.004f)
                curveToRelative(-0.913f, -1.21f, -2.349f, -2.004f, -3.978f, -2.004f)
                horizontalLineToRelative(-3.764f)
                lineToRelative(1.248f, -8.438f)
                curveToRelative(0.216f, -1.46f, 1.492f, -2.562f, 2.968f, -2.562f)
                horizontalLineToRelative(1.548f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.548f)
                curveTo(3.992f, 0.0f, 1.865f, 1.835f, 1.506f, 4.269f)
                lineTo(0.104f, 13.744f)
                curveToRelative(-0.069f, 0.453f, -0.104f, 0.913f, -0.104f, 1.368f)
                verticalLineToRelative(3.888f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.342f, -0.035f, -0.677f, -0.101f, -1.0f)
                horizontalLineToRelative(2.202f)
                curveToRelative(-0.066f, 0.323f, -0.101f, 0.658f, -0.101f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-3.888f)
                curveToRelative(0.0f, -0.455f, -0.035f, -0.915f, -0.104f, -1.363f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
