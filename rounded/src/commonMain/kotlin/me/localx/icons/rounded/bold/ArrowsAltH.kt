package me.localx.icons.rounded.bold

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

public val Icons.Bold.ArrowsAltH: ImageVector
    get() {
        if (_arrowsAltH != null) {
            return _arrowsAltH!!
        }
        _arrowsAltH = Builder(name = "ArrowsAltH", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.73f, 11.356f)
                lineToRelative(-5.154f, -5.087f)
                curveToRelative(-0.581f, -0.574f, -1.575f, -0.167f, -1.575f, 0.644f)
                verticalLineToRelative(3.587f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-3.587f)
                curveToRelative(0.0f, -0.811f, -0.994f, -1.218f, -1.575f, -0.644f)
                lineTo(0.27f, 11.356f)
                curveToRelative(-0.36f, 0.356f, -0.36f, 0.932f, 0.0f, 1.288f)
                lineToRelative(5.154f, 5.087f)
                curveToRelative(0.581f, 0.574f, 1.575f, 0.167f, 1.575f, -0.644f)
                verticalLineToRelative(-3.587f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.587f)
                curveToRelative(0.0f, 0.811f, 0.994f, 1.218f, 1.575f, 0.644f)
                lineToRelative(5.154f, -5.087f)
                curveToRelative(0.36f, -0.356f, 0.36f, -0.932f, 0.0f, -1.288f)
                close()
            }
        }
        .build()
        return _arrowsAltH!!
    }

private var _arrowsAltH: ImageVector? = null
