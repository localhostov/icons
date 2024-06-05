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

public val Icons.Filled.PickingBox: ImageVector
    get() {
        if (_pickingBox != null) {
            return _pickingBox!!
        }
        _pickingBox = Builder(name = "PickingBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 17.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(11.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 9.0f)
                horizontalLineToRelative(-2.473f)
                curveToRelative(-0.017f, 0.0f, -0.03f, 0.004f, -0.038f, 0.019f)
                curveToRelative(-0.116f, 0.205f, -1.135f, 2.007f, -1.332f, 2.337f)
                curveToRelative(-1.142f, 1.909f, -3.076f, 3.111f, -3.377f, 3.291f)
                curveToRelative(-0.386f, 0.231f, -0.829f, 0.354f, -1.279f, 0.354f)
                curveToRelative(-1.452f, 0.0f, -2.756f, -1.279f, -2.456f, -3.014f)
                curveToRelative(0.123f, -0.71f, 0.619f, -1.289f, 1.231f, -1.669f)
                curveToRelative(0.88f, -0.548f, 1.724f, -1.341f, 1.724f, -2.317f)
                curveToRelative(0.0f, -1.202f, -1.067f, -2.16f, -2.303f, -1.978f)
                curveToRelative(-1.007f, 0.149f, -1.697f, 1.11f, -1.697f, 2.128f)
                verticalLineToRelative(5.994f)
                curveToRelative(0.0f, 1.203f, -1.062f, 2.158f, -2.3f, 1.978f)
                curveToRelative(-1.007f, -0.147f, -1.7f, -1.104f, -1.7f, -2.121f)
                curveToRelative(0.0f, -1.675f, 0.0f, -4.979f, 0.0f, -7.957f)
                curveToRelative(0.0f, -3.339f, 2.707f, -6.044f, 6.046f, -6.044f)
                horizontalLineToRelative(9.954f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(4.0f, 13.731f)
                curveToRelative(-0.722f, 0.414f, -1.67f, 0.361f, -2.352f, -0.261f)
                curveToRelative(-0.752f, -0.686f, -0.789f, -1.867f, -0.218f, -2.711f)
                lineToRelative(2.57f, -3.799f)
                verticalLineToRelative(6.77f)
                close()
                moveTo(4.0f, 6.747f)
                lineToRelative(-1.175f, 0.534f)
                curveToRelative(-1.095f, 0.498f, -2.404f, -0.074f, -2.753f, -1.275f)
                curveToRelative(-0.284f, -0.978f, 0.302f, -2.005f, 1.229f, -2.426f)
                lineToRelative(3.926f, -1.785f)
                curveToRelative(-0.773f, 1.235f, -1.227f, 2.689f, -1.227f, 4.251f)
                verticalLineToRelative(0.701f)
                close()
            }
        }
        .build()
        return _pickingBox!!
    }

private var _pickingBox: ImageVector? = null
