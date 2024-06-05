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

public val Icons.Bold.Broccoli: ImageVector
    get() {
        if (_broccoli != null) {
            return _broccoli!!
        }
        _broccoli = Builder(name = "Broccoli", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 6.19f)
                arcTo(4.576f, 4.576f, 0.0f, false, false, 16.505f, 3.0f)
                arcToRelative(6.657f, 6.657f, 0.0f, false, false, -5.459f, -3.0f)
                arcTo(6.284f, 6.284f, 0.0f, false, false, 4.9f, 5.035f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 10.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 6.163f, 6.483f)
                arcTo(17.0f, 17.0f, 0.0f, false, true, 7.0f, 22.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.5f)
                curveToRelative(0.0f, -4.74f, 1.479f, -7.249f, 1.69f, -7.582f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 20.8f, 6.19f)
                close()
                moveTo(9.952f, 21.0f)
                arcTo(19.744f, 19.744f, 0.0f, false, false, 9.1f, 16.313f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, 1.726f, -1.156f)
                arcTo(5.342f, 5.342f, 0.0f, false, false, 13.5f, 16.0f)
                arcToRelative(5.237f, 5.237f, 0.0f, false, false, 1.535f, -0.235f)
                arcTo(19.823f, 19.823f, 0.0f, false, false, 14.045f, 21.0f)
                close()
                moveTo(19.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 10.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(4.451f, 4.451f, 0.0f, false, false, 0.3f, 1.569f)
                arcTo(2.233f, 2.233f, 0.0f, false, true, 13.5f, 13.0f)
                arcToRelative(3.528f, 3.528f, 0.0f, false, true, -1.817f, -0.915f)
                lineToRelative(-1.128f, -0.993f)
                lineToRelative(-0.992f, 1.131f)
                arcTo(5.117f, 5.117f, 0.0f, false, true, 6.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.0f, 10.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 9.5f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.5f)
                arcTo(4.487f, 4.487f, 0.0f, false, false, 7.833f, 5.671f)
                arcTo(3.275f, 3.275f, 0.0f, false, true, 11.046f, 3.0f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, 3.232f, 2.181f)
                lineTo(14.771f, 6.4f)
                lineToRelative(1.271f, -0.326f)
                arcTo(1.837f, 1.837f, 0.0f, false, true, 16.5f, 6.0f)
                arcTo(1.581f, 1.581f, 0.0f, false, true, 18.0f, 7.5f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _broccoli!!
    }

private var _broccoli: ImageVector? = null
