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

public val Icons.Filled.EnvelopeMarker: ImageVector
    get() {
        if (_envelopeMarker != null) {
            return _envelopeMarker!!
        }
        _envelopeMarker = Builder(name = "EnvelopeMarker", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.946f, 11.0f)
                arcToRelative(2.037f, 2.037f, 0.0f, false, true, -1.277f, -0.451f)
                lineTo(19.5f, 9.613f)
                lineToRelative(-1.169f, 0.936f)
                arcTo(2.051f, 2.051f, 0.0f, false, true, 15.0f, 8.948f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(8.948f)
                arcTo(2.057f, 2.057f, 0.0f, false, true, 21.946f, 11.0f)
                close()
                moveTo(12.0f, 15.422f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.122f, -0.876f)
                lineToRelative(1.731f, -1.731f)
                arcTo(4.085f, 4.085f, 0.0f, false, true, 15.3f, 12.6f)
                arcTo(4.017f, 4.017f, 0.0f, false, true, 13.0f, 8.948f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.219f, 4.886f)
                lineToRelative(9.659f, 9.66f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.422f)
                close()
                moveTo(23.7f, 12.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.2f, -0.425f)
                lineToRelative(-0.106f, -0.071f)
                lineTo(15.536f, 15.96f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, true, -7.072f, 0.0f)
                lineTo(0.0f, 7.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(12.43f)
                curveTo(23.9f, 12.487f, 23.808f, 12.548f, 23.7f, 12.6f)
                close()
            }
        }
        .build()
        return _envelopeMarker!!
    }

private var _envelopeMarker: ImageVector? = null
