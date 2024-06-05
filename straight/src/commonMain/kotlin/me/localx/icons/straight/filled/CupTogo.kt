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

public val Icons.Filled.CupTogo: ImageVector
    get() {
        if (_cupTogo != null) {
            return _cupTogo!!
        }
        _cupTogo = Builder(name = "CupTogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.999f, 4.0f)
                horizontalLineToRelative(-1.492f)
                lineToRelative(-0.338f, -1.616f)
                curveToRelative(-0.29f, -1.381f, -1.524f, -2.384f, -2.936f, -2.384f)
                lineTo(5.767f, -0.0f)
                curveToRelative(-1.412f, 0.0f, -2.646f, 1.003f, -2.937f, 2.385f)
                lineToRelative(-0.338f, 1.615f)
                lineTo(0.999f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.321f, 8.0f)
                lineToRelative(1.554f, 13.347f)
                curveToRelative(0.176f, 1.513f, 1.457f, 2.653f, 2.979f, 2.653f)
                horizontalLineToRelative(10.291f)
                curveToRelative(1.523f, 0.0f, 2.804f, -1.141f, 2.979f, -2.653f)
                lineToRelative(1.554f, -13.347f)
                lineTo(2.321f, 8.0f)
                close()
                moveTo(5.382f, 17.0f)
                horizontalLineToRelative(13.234f)
                lineToRelative(-0.233f, 2.0f)
                lineTo(5.615f, 19.0f)
                lineToRelative(-0.233f, -2.0f)
                close()
                moveTo(5.033f, 14.0f)
                lineToRelative(-0.233f, -2.0f)
                horizontalLineToRelative(14.399f)
                lineToRelative(-0.233f, 2.0f)
                lineTo(5.033f, 14.0f)
                close()
            }
        }
        .build()
        return _cupTogo!!
    }

private var _cupTogo: ImageVector? = null
