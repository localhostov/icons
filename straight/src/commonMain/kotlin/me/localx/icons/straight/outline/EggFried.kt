package me.localx.icons.straight.outline

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

public val Icons.Outline.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = Builder(name = "EggFried", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 16.0f)
                arcTo(5.5f, 5.5f, 0.0f, true, true, 15.0f, 10.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 9.5f, 16.0f)
                close()
                moveTo(9.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 13.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.5f, 7.0f)
                close()
                moveTo(13.0f, 24.0f)
                arcTo(13.015f, 13.015f, 0.0f, false, true, 0.0f, 11.0f)
                lineTo(0.0f, 10.0f)
                arcTo(9.994f, 9.994f, 0.0f, false, true, 18.716f, 5.114f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 2.265f, 11.871f)
                arcTo(8.026f, 8.026f, 0.0f, false, true, 13.0f, 24.0f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(1.0f)
                arcTo(11.013f, 11.013f, 0.0f, false, false, 13.0f, 22.0f)
                curveToRelative(3.2f, 0.0f, 6.0f, -2.57f, 6.0f, -5.5f)
                lineToRelative(0.0f, -0.715f)
                lineToRelative(0.545f, -0.278f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.574f, -8.483f)
                lineToRelative(-0.551f, -0.056f)
                lineToRelative(-0.244f, -0.5f)
                arcTo(7.952f, 7.952f, 0.0f, false, false, 10.0f, 2.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 18.0f)
                close()
                moveTo(19.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 10.0f)
                close()
                moveTo(15.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 16.0f)
                close()
            }
        }
        .build()
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
