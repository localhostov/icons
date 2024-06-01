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

public val Icons.Filled.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5132f, 15.487f)
                lineTo(5.6792f, 19.653f)
                curveTo(6.2418f, 20.2154f, 7.0047f, 20.5314f, 7.8002f, 20.5314f)
                curveTo(8.5957f, 20.5314f, 9.3586f, 20.2154f, 9.9212f, 19.653f)
                lineTo(22.7872f, 6.787f)
                curveTo(22.9694f, 6.5984f, 23.0702f, 6.3458f, 23.0679f, 6.0836f)
                curveTo(23.0656f, 5.8214f, 22.9605f, 5.5706f, 22.775f, 5.3852f)
                curveTo(22.5896f, 5.1998f, 22.3388f, 5.0946f, 22.0766f, 5.0923f)
                curveTo(21.8144f, 5.09f, 21.5618f, 5.1908f, 21.3732f, 5.373f)
                lineTo(8.5072f, 18.239f)
                curveTo(8.3197f, 18.4265f, 8.0654f, 18.5318f, 7.8002f, 18.5318f)
                curveTo(7.5351f, 18.5318f, 7.2807f, 18.4265f, 7.0932f, 18.239f)
                lineTo(2.9272f, 14.073f)
                curveTo(2.7386f, 13.8908f, 2.486f, 13.79f, 2.2238f, 13.7923f)
                curveTo(1.9616f, 13.7946f, 1.7108f, 13.8998f, 1.5254f, 14.0852f)
                curveTo(1.34f, 14.2706f, 1.2348f, 14.5214f, 1.2326f, 14.7836f)
                curveTo(1.2303f, 15.0458f, 1.3311f, 15.2984f, 1.5132f, 15.487f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
