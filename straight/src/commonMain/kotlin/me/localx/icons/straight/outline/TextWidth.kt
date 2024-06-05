package me.localx.icons.straight.outline

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

public val Icons.Outline.TextWidth: ImageVector
    get() {
        if (_textWidth != null) {
            return _textWidth!!
        }
        _textWidth = Builder(name = "TextWidth", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.42f, 17.55f)
                lineToRelative(-3.26f, -3.26f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.3f, 2.29f)
                lineTo(2.96f, 17.99f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.26f, 3.25f)
                curveToRelative(-0.38f, 0.38f, -0.58f, 0.88f, -0.58f, 1.41f)
                reflectiveCurveToRelative(0.21f, 1.03f, 0.58f, 1.41f)
                lineToRelative(3.26f, 3.26f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.21f, -2.2f)
                lineTo(20.95f, 20.01f)
                lineToRelative(-2.2f, 2.2f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.26f, -3.25f)
                curveToRelative(0.38f, -0.38f, 0.58f, -0.88f, 0.58f, -1.41f)
                reflectiveCurveToRelative(-0.21f, -1.03f, -0.58f, -1.41f)
                close()
            }
        }
        .build()
        return _textWidth!!
    }

private var _textWidth: ImageVector? = null
