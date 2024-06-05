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

public val Icons.Bold.Spoon: ImageVector
    get() {
        if (_spoon != null) {
            return _spoon!!
        }
        _spoon = Builder(name = "Spoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.838f, 1.162f)
                curveToRelative(-2.707f, -2.708f, -8.746f, -0.13f, -11.0f, 2.123f)
                arcToRelative(6.282f, 6.282f, 0.0f, false, false, -0.927f, 7.682f)
                lineTo(0.064f, 21.814f)
                lineToRelative(2.122f, 2.122f)
                lineTo(13.031f, 13.09f)
                arcToRelative(6.262f, 6.262f, 0.0f, false, false, 7.684f, -0.929f)
                curveTo(22.968f, 9.908f, 25.548f, 3.872f, 22.838f, 1.162f)
                close()
                moveTo(18.594f, 10.04f)
                arcToRelative(3.356f, 3.356f, 0.0f, false, true, -4.634f, 0.0f)
                arcToRelative(3.281f, 3.281f, 0.0f, false, true, 0.0f, -4.634f)
                arcToRelative(9.812f, 9.812f, 0.0f, false, true, 5.708f, -2.423f)
                arcToRelative(1.493f, 1.493f, 0.0f, false, true, 1.05f, 0.3f)
                curveTo(21.626f, 4.192f, 20.336f, 8.3f, 18.594f, 10.04f)
                close()
            }
        }
        .build()
        return _spoon!!
    }

private var _spoon: ImageVector? = null
