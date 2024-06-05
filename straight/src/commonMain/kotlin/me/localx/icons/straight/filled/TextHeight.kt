package me.localx.icons.straight.filled

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

public val Icons.Filled.TextHeight: ImageVector
    get() {
        if (_textHeight != null) {
            return _textHeight!!
        }
        _textHeight = Builder(name = "TextHeight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(20.0f, 20.96f)
                lineTo(20.0f, 10.05f)
                lineToRelative(2.2f, 2.2f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.26f, -3.26f)
                curveToRelative(-0.78f, -0.78f, -2.04f, -0.78f, -2.81f, 0.0f)
                lineToRelative(-3.26f, 3.26f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.29f, -2.3f)
                verticalLineToRelative(11.09f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.26f, 3.26f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(3.26f, -3.26f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.2f, 2.21f)
                close()
            }
        }
        .build()
        return _textHeight!!
    }

private var _textHeight: ImageVector? = null
