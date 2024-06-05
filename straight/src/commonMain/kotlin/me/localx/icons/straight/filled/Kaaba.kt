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

public val Icons.Filled.Kaaba: ImageVector
    get() {
        if (_kaaba != null) {
            return _kaaba!!
        }
        _kaaba = Builder(name = "Kaaba", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.001f, 5.464f)
                lineTo(12.0f, 0.164f)
                lineToRelative(9.999f, 5.3f)
                lineToRelative(-9.999f, 5.3f)
                lineTo(2.001f, 5.464f)
                close()
                moveTo(23.0f, 11.859f)
                verticalLineToRelative(6.146f)
                lineToRelative(-11.0f, 5.831f)
                lineTo(1.0f, 18.005f)
                verticalLineToRelative(-6.175f)
                lineToRelative(4.0f, 2.127f)
                verticalLineToRelative(-2.264f)
                lineToRelative(-4.0f, -2.128f)
                verticalLineToRelative(-2.366f)
                lineToRelative(11.0f, 5.83f)
                lineToRelative(11.0f, -5.83f)
                verticalLineToRelative(2.399f)
                lineToRelative(-4.0f, 2.194f)
                verticalLineToRelative(2.264f)
                lineToRelative(4.0f, -2.196f)
                close()
                moveTo(11.0f, 14.873f)
                lineToRelative(-4.0f, -2.121f)
                verticalLineToRelative(2.264f)
                lineToRelative(4.0f, 2.121f)
                verticalLineToRelative(-2.264f)
                close()
                moveTo(17.0f, 12.851f)
                lineToRelative(-4.0f, 2.041f)
                verticalLineToRelative(2.264f)
                lineToRelative(4.0f, -2.041f)
                verticalLineToRelative(-2.264f)
                close()
            }
        }
        .build()
        return _kaaba!!
    }

private var _kaaba: ImageVector? = null
