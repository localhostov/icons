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

public val Icons.Bold.TextBox: ImageVector
    get() {
        if (_textBox != null) {
            return _textBox!!
        }
        _textBox = Builder(name = "TextBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 18.171f)
                lineTo(22.0f, 5.829f)
                curveToRelative(1.165f, -0.412f, 2.0f, -1.523f, 2.0f, -2.829f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.306f, 0.0f, -2.417f, 0.835f, -2.829f, 2.0f)
                lineTo(5.829f, 2.0f)
                curveToRelative(-0.412f, -1.165f, -1.523f, -2.0f, -2.829f, -2.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                curveToRelative(0.0f, 1.306f, 0.835f, 2.417f, 2.0f, 2.829f)
                verticalLineToRelative(12.343f)
                curveToRelative(-1.165f, 0.412f, -2.0f, 1.523f, -2.0f, 2.829f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.306f, 0.0f, 2.417f, -0.835f, 2.829f, -2.0f)
                horizontalLineToRelative(12.343f)
                curveToRelative(0.412f, 1.165f, 1.523f, 2.0f, 2.829f, 2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.306f, -0.835f, -2.417f, -2.0f, -2.829f)
                close()
                moveTo(5.0f, 18.764f)
                lineTo(5.0f, 5.235f)
                curveToRelative(0.083f, -0.074f, 0.161f, -0.153f, 0.235f, -0.235f)
                horizontalLineToRelative(13.529f)
                curveToRelative(0.074f, 0.083f, 0.153f, 0.161f, 0.235f, 0.235f)
                verticalLineToRelative(13.529f)
                curveToRelative(-0.083f, 0.074f, -0.161f, 0.153f, -0.235f, 0.235f)
                lineTo(5.235f, 18.999f)
                curveToRelative(-0.074f, -0.083f, -0.153f, -0.161f, -0.235f, -0.235f)
                close()
                moveTo(16.0f, 8.499f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _textBox!!
    }

private var _textBox: ImageVector? = null
