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

public val Icons.Bold.Ornament: ImageVector
    get() {
        if (_ornament != null) {
            return _ornament!!
        }
        _ornament = Builder(name = "Ornament", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 4.836f)
                verticalLineToRelative(-1.836f)
                horizontalLineToRelative(-2.271f)
                curveToRelative(0.17f, -0.294f, 0.268f, -0.636f, 0.268f, -1.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.364f, 0.098f, 0.706f, 0.268f, 1.0f)
                horizontalLineToRelative(-2.266f)
                verticalLineToRelative(1.836f)
                curveToRelative(-3.529f, 1.546f, -6.0f, 5.072f, -6.0f, 9.164f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -4.093f, -2.471f, -7.618f, -6.0f, -9.164f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(3.785f, 0.0f, 6.878f, 3.02f, 6.996f, 6.777f)
                lineToRelative(-3.542f, -3.542f)
                lineToRelative(-3.458f, 3.458f)
                lineToRelative(-3.294f, -3.293f)
                lineToRelative(-3.7f, 3.7f)
                curveToRelative(0.0f, -0.033f, -0.001f, -0.066f, -0.001f, -0.099f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-2.611f, 0.0f, -4.893f, -1.437f, -6.096f, -3.562f)
                lineToRelative(2.797f, -2.796f)
                lineToRelative(3.294f, 3.293f)
                lineToRelative(3.458f, -3.458f)
                lineToRelative(2.755f, 2.755f)
                curveToRelative(-1.169f, 2.238f, -3.513f, 3.769f, -6.208f, 3.769f)
                close()
            }
        }
        .build()
        return _ornament!!
    }

private var _ornament: ImageVector? = null
