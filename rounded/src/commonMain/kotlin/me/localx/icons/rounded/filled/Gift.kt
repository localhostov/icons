package me.localx.icons.rounded.filled

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

public val Icons.Filled.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                lineTo(7.0f, 24.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                close()
                moveTo(24.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(13.0f, 13.0f)
                lineTo(13.0f, 8.957f)
                curveToRelative(-0.336f, 0.026f, -0.671f, 0.043f, -1.0f, 0.043f)
                reflectiveCurveToRelative(-0.664f, -0.017f, -1.0f, -0.043f)
                lineTo(11.0f, 13.0f)
                lineTo(2.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 7.0f)
                lineTo(5.738f, 7.0f)
                arcTo(5.137f, 5.137f, 0.0f, false, true, 4.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 3.0f)
                curveToRelative(0.0f, 2.622f, 2.371f, 3.53f, 4.174f, 3.841f)
                arcTo(9.332f, 9.332f, 0.0f, false, true, 9.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                arcToRelative(9.332f, 9.332f, 0.0f, false, true, -1.174f, 3.841f)
                curveTo(15.629f, 6.53f, 18.0f, 5.622f, 18.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcToRelative(5.137f, 5.137f, 0.0f, false, true, -1.738f, 4.0f)
                lineTo(20.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 11.0f)
                close()
                moveTo(11.0f, 3.0f)
                arcToRelative(7.71f, 7.71f, 0.0f, false, false, 1.0f, 3.013f)
                arcTo(7.71f, 7.71f, 0.0f, false, false, 13.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                close()
                moveTo(13.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(22.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
