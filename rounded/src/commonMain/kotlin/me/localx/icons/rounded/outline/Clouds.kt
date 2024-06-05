package me.localx.icons.rounded.outline

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

public val Icons.Outline.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.123f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.567f, -0.177f)
                arcToRelative(5.37f, 5.37f, 0.0f, false, true, 0.51f, -9.3f)
                arcToRelative(7.648f, 7.648f, 0.0f, false, true, -0.8f, -5.179f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.49f, -0.841f)
                arcToRelative(1.085f, 1.085f, 0.0f, false, false, 0.722f, 0.733f)
                arcToRelative(7.982f, 7.982f, 0.0f, false, true, 5.312f, 5.354f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.916f, 0.572f)
                arcToRelative(5.988f, 5.988f, 0.0f, false, false, -3.983f, -4.014f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 15.724f, 6.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.06f, 4.512f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, true, -0.792f, 2.687f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, false, -0.3f, 5.881f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.123f)
                close()
                moveTo(19.1f, 24.0f)
                arcToRelative(5.322f, 5.322f, 0.0f, false, false, 1.062f, -0.158f)
                arcToRelative(4.946f, 4.946f, 0.0f, false, false, 3.7f, -3.7f)
                arcToRelative(5.012f, 5.012f, 0.0f, false, false, -3.557f, -6.0f)
                reflectiveCurveToRelative(-0.629f, -0.145f, -0.766f, -0.471f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.367f, 0.856f)
                arcToRelative(6.38f, 6.38f, 0.0f, false, false, -0.057f, 2.732f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.451f, 6.589f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 9.4f, 24.0f)
                close()
                moveTo(17.7f, 14.444f)
                verticalLineToRelative(0.0f)
                arcToRelative(2.647f, 2.647f, 0.0f, false, false, 2.088f, 1.633f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, true, 2.132f, 3.62f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, true, -2.2f, 2.194f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, true, -0.655f, 0.082f)
                curveToRelative(-1.665f, 0.033f, -8.271f, 0.038f, -9.6f, 0.0f)
                arcToRelative(1.709f, 1.709f, 0.0f, false, true, -0.379f, -0.055f)
                arcTo(1.471f, 1.471f, 0.0f, false, true, 8.057f, 20.9f)
                arcToRelative(1.493f, 1.493f, 0.0f, false, true, 0.85f, -1.795f)
                arcToRelative(2.017f, 2.017f, 0.0f, false, false, 1.18f, -2.305f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, true, 0.031f, -1.792f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.577f, -0.562f)
                close()
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
