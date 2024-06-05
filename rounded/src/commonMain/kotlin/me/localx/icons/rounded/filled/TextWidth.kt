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

public val Icons.Filled.TextWidth: ImageVector
    get() {
        if (_textWidth != null) {
            return _textWidth!!
        }
        _textWidth = Builder(name = "TextWidth", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(-1.5f)
                curveTo(4.0f, 2.02f, 6.02f, 0.0f, 8.5f, 0.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(13.0f, 14.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 19.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, -0.01f)
                curveToRelative(0.0f, -0.51f, -0.2f, -1.02f, -0.58f, -1.4f)
                lineToRelative(-2.75f, -2.75f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.75f, 1.75f)
                lineTo(3.0f, 18.0f)
                lineToRelative(1.75f, -1.75f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-2.75f, 2.75f)
                curveTo(0.2f, 17.97f, 0.0f, 18.48f, 0.0f, 18.99f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.01f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.01f)
                curveToRelative(0.0f, 0.51f, 0.2f, 1.02f, 0.58f, 1.4f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-1.75f, -1.75f)
                lineTo(21.0f, 20.0f)
                lineToRelative(-1.75f, 1.75f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(2.75f, -2.75f)
                curveToRelative(0.39f, -0.39f, 0.58f, -0.9f, 0.58f, -1.4f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.01f)
                close()
            }
        }
        .build()
        return _textWidth!!
    }

private var _textWidth: ImageVector? = null
