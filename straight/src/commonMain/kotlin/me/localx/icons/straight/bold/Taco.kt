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

public val Icons.Bold.Taco: ImageVector
    get() {
        if (_taco != null) {
            return _taco!!
        }
        _taco = Builder(name = "Taco", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.575f, 8.52f)
                arcTo(8.628f, 8.628f, 0.0f, false, false, 23.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                curveToRelative(-0.017f, 0.0f, -0.033f, 0.0f, -0.05f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 1.0f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, false, -1.072f, 0.25f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, -4.856f, 0.0f)
                arcTo(2.474f, 2.474f, 0.0f, false, false, 10.5f, 1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.05f, 3.005f)
                curveToRelative(-0.017f, 0.0f, -0.033f, 0.0f, -0.05f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 6.0f)
                arcToRelative(9.784f, 9.784f, 0.0f, false, false, 0.831f, 3.633f)
                arcTo(9.429f, 9.429f, 0.0f, false, false, 5.0f, 13.5f)
                lineTo(5.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(3.0f, 13.5f)
                arcToRelative(6.42f, 6.42f, 0.0f, false, true, 0.91f, -3.273f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -0.889f, -3.645f)
                arcTo(9.456f, 9.456f, 0.0f, false, false, 0.0f, 13.5f)
                lineTo(0.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(20.5f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.5f)
                verticalLineToRelative(-7.0f)
                arcTo(9.436f, 9.436f, 0.0f, false, false, 22.575f, 8.52f)
                close()
                moveTo(21.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(7.874f, 21.0f)
                arcTo(4.024f, 4.024f, 0.0f, false, false, 8.0f, 20.0f)
                lineTo(8.0f, 13.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 13.0f, 0.0f)
                close()
                moveTo(19.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 17.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 13.5f)
                close()
                moveTo(17.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 15.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 17.5f)
                close()
            }
        }
        .build()
        return _taco!!
    }

private var _taco: ImageVector? = null
