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

public val Icons.Filled.EyeCrossed: ImageVector
    get() {
        if (_eyeCrossed != null) {
            return _eyeCrossed!!
        }
        _eyeCrossed = Builder(name = "EyeCrossed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.821f, 11.181f)
                verticalLineToRelative(0.0f)
                arcToRelative(15.736f, 15.736f, 0.0f, false, false, -4.145f, -5.44f)
                lineToRelative(3.032f, -3.032f)
                lineTo(21.293f, 1.293f)
                lineTo(18.0f, 4.583f)
                arcTo(11.783f, 11.783f, 0.0f, false, false, 12.0f, 3.0f)
                curveTo(4.5f, 3.0f, 1.057f, 9.261f, 0.179f, 11.181f)
                arcToRelative(1.969f, 1.969f, 0.0f, false, false, 0.0f, 1.64f)
                arcToRelative(15.736f, 15.736f, 0.0f, false, false, 4.145f, 5.44f)
                lineTo(1.293f, 21.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(6.0f, 19.417f)
                arcTo(11.783f, 11.783f, 0.0f, false, false, 12.0f, 21.0f)
                curveToRelative(7.5f, 0.0f, 10.943f, -6.261f, 11.821f, -8.181f)
                arcTo(1.968f, 1.968f, 0.0f, false, false, 23.821f, 11.181f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(5.99f, 5.99f, 0.0f, false, true, 9.471f, -4.885f)
                lineTo(14.019f, 8.567f)
                arcTo(3.947f, 3.947f, 0.0f, false, false, 12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, false, 0.567f, 2.019f)
                lineTo(7.115f, 15.471f)
                arcTo(5.961f, 5.961f, 0.0f, false, true, 6.0f, 12.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(5.961f, 5.961f, 0.0f, false, true, -3.471f, -1.115f)
                lineToRelative(1.452f, -1.452f)
                arcTo(3.947f, 3.947f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, false, -0.567f, -2.019f)
                lineToRelative(1.452f, -1.452f)
                arcTo(5.99f, 5.99f, 0.0f, false, true, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _eyeCrossed!!
    }

private var _eyeCrossed: ImageVector? = null
