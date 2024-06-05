package me.localx.icons.straight.bold

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

public val Icons.Bold.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(12.0f, 24.0f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, true, -4.734f, -3.39f)
                arcTo(5.322f, 5.322f, 0.0f, false, true, 2.194f, 12.0f)
                arcTo(5.322f, 5.322f, 0.0f, false, true, 7.266f, 3.39f)
                arcToRelative(5.017f, 5.017f, 0.0f, false, true, 9.468f, 0.0f)
                arcTo(5.322f, 5.322f, 0.0f, false, true, 21.806f, 12.0f)
                arcToRelative(5.322f, 5.322f, 0.0f, false, true, -5.072f, 8.61f)
                arcTo(5.008f, 5.008f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(10.0f, 15.688f)
                lineTo(10.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(14.0f, 15.8f)
                lineToRelative(2.581f, 1.589f)
                arcToRelative(2.314f, 2.314f, 0.0f, true, false, 2.2f, -4.07f)
                lineTo(16.362f, 12.0f)
                lineToRelative(2.421f, -1.317f)
                arcToRelative(2.314f, 2.314f, 0.0f, true, false, -2.2f, -4.07f)
                lineTo(14.0f, 8.2f)
                lineTo(14.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                lineTo(10.0f, 8.312f)
                lineTo(7.4f, 6.6f)
                arcToRelative(2.314f, 2.314f, 0.0f, true, false, -2.181f, 4.081f)
                lineTo(7.638f, 12.0f)
                lineTo(5.217f, 13.317f)
                arcTo(2.314f, 2.314f, 0.0f, true, false, 7.4f, 17.4f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
