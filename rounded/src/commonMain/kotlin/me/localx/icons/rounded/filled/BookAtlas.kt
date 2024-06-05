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

public val Icons.Filled.BookAtlas: ImageVector
    get() {
        if (_bookAtlas != null) {
            return _bookAtlas!!
        }
        _bookAtlas = Builder(name = "BookAtlas", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                lineTo(22.0f, 18.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(11.0f)
                lineTo(5.0f, 16.0f)
                curveToRelative(-0.203f, 0.0f, -0.406f, 0.02f, -0.605f, 0.061f)
                curveToRelative(-0.87f, 0.104f, -1.696f, 0.437f, -2.395f, 0.964f)
                lineTo(2.0f, 4.973f)
                curveToRelative(0.0f, -2.744f, 2.224f, -4.973f, 4.967f, -4.973f)
                horizontalLineToRelative(10.033f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(9.392f, 12.334f)
                curveToRelative(-0.251f, -1.215f, -0.351f, -2.473f, -0.39f, -3.334f)
                horizontalLineToRelative(-2.935f)
                curveToRelative(0.27f, 1.6f, 1.177f, 2.98f, 2.448f, 3.882f)
                curveToRelative(0.41f, 0.291f, 0.978f, -0.055f, 0.877f, -0.548f)
                close()
                moveTo(8.515f, 3.119f)
                curveToRelative(-1.271f, 0.901f, -2.178f, 2.282f, -2.448f, 3.882f)
                horizontalLineToRelative(2.935f)
                curveToRelative(0.039f, -0.861f, 0.14f, -2.119f, 0.39f, -3.334f)
                curveToRelative(0.102f, -0.493f, -0.466f, -0.839f, -0.877f, -0.548f)
                close()
                moveTo(12.953f, 9.001f)
                horizontalLineToRelative(-1.954f)
                curveToRelative(0.107f, 2.564f, 0.435f, 4.829f, 0.977f, 4.829f)
                reflectiveCurveToRelative(0.87f, -2.265f, 0.977f, -4.829f)
                close()
                moveTo(12.953f, 7.001f)
                curveToRelative(-0.107f, -2.564f, -0.416f, -4.829f, -0.977f, -4.829f)
                reflectiveCurveToRelative(-0.87f, 2.265f, -0.977f, 4.829f)
                horizontalLineToRelative(1.954f)
                close()
                moveTo(17.886f, 9.001f)
                horizontalLineToRelative(-2.935f)
                curveToRelative(-0.039f, 0.861f, -0.14f, 2.119f, -0.39f, 3.334f)
                curveToRelative(-0.102f, 0.493f, 0.466f, 0.839f, 0.877f, 0.548f)
                curveToRelative(1.271f, -0.902f, 2.178f, -2.282f, 2.448f, -3.882f)
                close()
                moveTo(17.886f, 7.001f)
                curveToRelative(-0.27f, -1.6f, -1.177f, -2.98f, -2.448f, -3.882f)
                curveToRelative(-0.41f, -0.291f, -0.978f, 0.055f, -0.877f, 0.548f)
                curveToRelative(0.251f, 1.215f, 0.351f, 2.473f, 0.39f, 3.334f)
                horizontalLineToRelative(2.935f)
                close()
            }
        }
        .build()
        return _bookAtlas!!
    }

private var _bookAtlas: ImageVector? = null
