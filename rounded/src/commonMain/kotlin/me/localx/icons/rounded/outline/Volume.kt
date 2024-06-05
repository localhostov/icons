package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(name = "Volume", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.807f, 4.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.415f, 1.415f)
                arcToRelative(8.913f, 8.913f, 0.0f, false, true, 0.0f, 12.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.415f, 1.415f)
                arcTo(10.916f, 10.916f, 0.0f, false, false, 20.807f, 4.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1f, 7.291f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.68f, 8.706f)
                arcToRelative(4.662f, 4.662f, 0.0f, false, true, 0.0f, 6.588f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.1f, 16.709f)
                arcTo(6.666f, 6.666f, 0.0f, false, false, 18.1f, 7.291f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.82f, 0.2f)
                arcTo(12.054f, 12.054f, 0.0f, false, false, 6.266f, 5.0f)
                horizontalLineTo(5.0f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(6.266f)
                arcTo(12.059f, 12.059f, 0.0f, false, false, 13.82f, 23.8f)
                arcToRelative(0.917f, 0.917f, 0.0f, false, false, 0.181f, 0.017f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(1.186f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.82f, 0.2f)
                close()
                moveTo(13.0f, 21.535f)
                arcToRelative(10.083f, 10.083f, 0.0f, false, true, -5.371f, -4.08f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.792f, 17.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 7.0f)
                horizontalLineToRelative(1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.837f, -0.453f)
                arcTo(10.079f, 10.079f, 0.0f, false, true, 13.0f, 2.465f)
                close()
            }
        }
        .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
