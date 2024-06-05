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

public val Icons.Bold.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = Builder(name = "EggFried", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 5.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 14.0f, 9.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 9.5f, 5.0f)
                close()
                moveTo(9.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 11.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 11.0f)
                close()
                moveTo(18.472f, 5.136f)
                arcTo(9.666f, 9.666f, 0.0f, false, false, 10.091f, 0.0f)
                arcTo(10.1f, 10.1f, 0.0f, false, false, 0.0f, 10.091f)
                verticalLineToRelative(0.954f)
                arcTo(12.97f, 12.97f, 0.0f, false, false, 12.954f, 24.0f)
                arcToRelative(7.869f, 7.869f, 0.0f, false, false, 7.99f, -6.722f)
                arcTo(7.158f, 7.158f, 0.0f, false, false, 24.0f, 11.523f)
                arcTo(6.7f, 6.7f, 0.0f, false, false, 18.472f, 5.136f)
                close()
                moveTo(18.812f, 15.066f)
                lineTo(18.0f, 15.582f)
                lineTo(18.0f, 16.5f)
                curveToRelative(0.0f, 2.439f, -2.311f, 4.5f, -5.046f, 4.5f)
                arcTo(9.966f, 9.966f, 0.0f, false, true, 3.0f, 11.045f)
                verticalLineToRelative(-0.954f)
                arcTo(7.1f, 7.1f, 0.0f, false, true, 10.091f, 3.0f)
                arcToRelative(6.864f, 6.864f, 0.0f, false, true, 6.063f, 4.164f)
                lineToRelative(0.367f, 0.744f)
                lineToRelative(0.826f, 0.084f)
                curveTo(19.143f, 8.176f, 21.0f, 9.547f, 21.0f, 11.523f)
                arcTo(4.189f, 4.189f, 0.0f, false, true, 18.812f, 15.066f)
                close()
                moveTo(19.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 17.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 11.5f)
                close()
                moveTo(16.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 16.5f)
                close()
            }
        }
        .build()
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
