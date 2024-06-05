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

public val Icons.Bold.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.692f, 7.446f)
                lineTo(14.1f, 0.723f)
                arcToRelative(3.409f, 3.409f, 0.0f, false, false, -4.2f, 0.0f)
                lineTo(1.307f, 7.447f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 0.0f, 10.132f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.132f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 22.692f, 7.446f)
                close()
                moveTo(16.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(19.0f, 21.0f)
                lineTo(19.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(8.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 10.132f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, 0.157f, -0.322f)
                lineToRelative(8.589f, -6.722f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, true, 0.506f, 0.0f)
                lineToRelative(8.59f, 6.722f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, true, 0.158f, 0.323f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
