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

public val Icons.Filled.Customize: ImageVector
    get() {
        if (_customize != null) {
            return _customize!!
        }
        _customize = Builder(name = "Customize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.365f, 3.699f)
                lineToRelative(-1.322f, 1.322f)
                lineToRelative(-3.064f, -3.064f)
                lineToRelative(1.234f, -1.234f)
                curveToRelative(0.801f, -0.801f, 2.108f, -0.955f, 2.985f, -0.237f)
                curveToRelative(1.009f, 0.825f, 1.064f, 2.316f, 0.166f, 3.214f)
                close()
                moveTo(17.565f, 3.371f)
                lineToRelative(-5.296f, 5.296f)
                curveToRelative(-0.813f, 0.813f, -1.269f, 1.915f, -1.269f, 3.064f)
                verticalLineToRelative(0.769f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.769f)
                curveToRelative(1.149f, 0.0f, 2.251f, -0.457f, 3.064f, -1.269f)
                lineToRelative(5.296f, -5.296f)
                lineToRelative(-3.064f, -3.064f)
                close()
                moveTo(21.272f, 13.885f)
                lineToRelative(-0.451f, -0.26f)
                curveToRelative(0.102f, -0.544f, 0.153f, -1.088f, 0.153f, -1.625f)
                reflectiveCurveToRelative(-0.051f, -1.081f, -0.153f, -1.625f)
                lineToRelative(-0.29f, -1.015f)
                lineToRelative(-3.784f, 3.784f)
                curveToRelative(-1.196f, 1.196f, -2.786f, 1.855f, -4.478f, 1.855f)
                horizontalLineToRelative(-0.77f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-0.77f)
                curveToRelative(0.0f, -1.691f, 0.659f, -3.281f, 1.855f, -4.478f)
                lineToRelative(4.119f, -4.119f)
                verticalLineToRelative(-0.134f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(0.522f)
                curveToRelative(-1.047f, 0.37f, -2.016f, 0.929f, -2.857f, 1.649f)
                lineToRelative(-0.45f, -0.259f)
                curveToRelative(-0.693f, -0.398f, -1.501f, -0.504f, -2.277f, -0.295f)
                curveToRelative(-0.773f, 0.208f, -1.419f, 0.706f, -1.818f, 1.4f)
                curveToRelative(-0.4f, 0.694f, -0.505f, 1.503f, -0.296f, 2.277f)
                curveToRelative(0.208f, 0.773f, 0.706f, 1.419f, 1.401f, 1.819f)
                lineToRelative(0.451f, 0.259f)
                curveToRelative(-0.102f, 0.544f, -0.153f, 1.088f, -0.153f, 1.626f)
                reflectiveCurveToRelative(0.051f, 1.082f, 0.153f, 1.626f)
                lineToRelative(-0.451f, 0.259f)
                curveToRelative(-0.695f, 0.4f, -1.192f, 1.046f, -1.401f, 1.819f)
                curveToRelative(-0.209f, 0.774f, -0.104f, 1.583f, 0.295f, 2.276f)
                curveToRelative(0.399f, 0.695f, 1.045f, 1.193f, 1.819f, 1.401f)
                curveToRelative(0.776f, 0.21f, 1.584f, 0.104f, 2.277f, -0.295f)
                lineToRelative(0.45f, -0.259f)
                curveToRelative(0.841f, 0.721f, 1.81f, 1.279f, 2.857f, 1.649f)
                verticalLineToRelative(0.522f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-0.522f)
                curveToRelative(1.047f, -0.37f, 2.016f, -0.929f, 2.857f, -1.649f)
                lineToRelative(0.45f, 0.259f)
                curveToRelative(0.695f, 0.399f, 1.503f, 0.505f, 2.277f, 0.295f)
                curveToRelative(0.773f, -0.208f, 1.419f, -0.706f, 1.819f, -1.401f)
                curveToRelative(0.825f, -1.434f, 0.329f, -3.271f, -1.105f, -4.096f)
                close()
            }
        }
        .build()
        return _customize!!
    }

private var _customize: ImageVector? = null
