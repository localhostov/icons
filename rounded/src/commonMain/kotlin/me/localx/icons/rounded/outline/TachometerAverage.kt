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

public val Icons.Outline.TachometerAverage: ImageVector
    get() {
        if (_tachometerAverage != null) {
            return _tachometerAverage!!
        }
        _tachometerAverage = Builder(name = "TachometerAverage", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.0f, -1.732f)
                lineTo(11.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.268f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(20.0f, 4.052f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 3.555f, 21.516f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, false, 4.073f, 0.129f)
                lineToRelative(1.026f, -0.888f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.308f, -1.514f)
                lineToRelative(-1.027f, 0.889f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.357f, -0.038f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 14.114f, -0.037f)
                arcToRelative(1.018f, 1.018f, 0.0f, false, true, -1.395f, 0.074f)
                lineToRelative(-1.027f, -0.888f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.308f, 1.514f)
                lineToRelative(1.027f, 0.887f)
                arcToRelative(3.034f, 3.034f, 0.0f, false, false, 4.118f, -0.174f)
                arcTo(12.057f, 12.057f, 0.0f, false, false, 20.0f, 4.052f)
                close()
            }
        }
        .build()
        return _tachometerAverage!!
    }

private var _tachometerAverage: ImageVector? = null
