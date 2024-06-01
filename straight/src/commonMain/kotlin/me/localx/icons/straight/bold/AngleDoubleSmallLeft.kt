package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.AngleDoubleSmallLeft: ImageVector
    get() {
        if (_angleDoubleSmallLeft != null) {
            return _angleDoubleSmallLeft!!
        }
        _angleDoubleSmallLeft = Builder(name = "AngleDoubleSmallLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.543f, 7.061f)
                lineTo(9.422f, 4.939f)
                lineTo(4.129f, 10.232f)
                curveTo(3.8968f, 10.4641f, 3.7126f, 10.7397f, 3.5869f, 11.0431f)
                curveTo(3.4612f, 11.3465f, 3.3965f, 11.6716f, 3.3965f, 12.0f)
                curveTo(3.3965f, 12.3283f, 3.4612f, 12.6535f, 3.5869f, 12.9568f)
                curveTo(3.7126f, 13.2602f, 3.8968f, 13.5358f, 4.129f, 13.768f)
                lineTo(9.422f, 19.061f)
                lineTo(11.543f, 16.939f)
                lineTo(6.6f, 12.0f)
                lineTo(11.543f, 7.061f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5431f, 7.061f)
                lineTo(16.4221f, 4.939f)
                lineTo(10.4221f, 10.939f)
                curveTo(10.2827f, 11.0783f, 10.1721f, 11.2437f, 10.0967f, 11.4257f)
                curveTo(10.0213f, 11.6078f, 9.9824f, 11.8029f, 9.9824f, 12.0f)
                curveTo(9.9824f, 12.197f, 10.0213f, 12.3922f, 10.0967f, 12.5742f)
                curveTo(10.1721f, 12.7563f, 10.2827f, 12.9217f, 10.4221f, 13.061f)
                lineTo(16.4221f, 19.061f)
                lineTo(18.5431f, 16.939f)
                lineTo(13.6001f, 12.0f)
                lineTo(18.5431f, 7.061f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallLeft!!
    }

private var _angleDoubleSmallLeft: ImageVector? = null
