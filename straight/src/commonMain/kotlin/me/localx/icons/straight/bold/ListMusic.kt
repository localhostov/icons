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

public val Icons.Bold.ListMusic: ImageVector
    get() {
        if (_listMusic != null) {
            return _listMusic!!
        }
        _listMusic = Builder(name = "ListMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(10.602f)
                curveToRelative(-0.751f, -0.385f, -1.6f, -0.602f, -2.5f, -0.602f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(13.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(13.0f, 3.0f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.866f, 15.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(9.756f)
                curveToRelative(-1.224f, 0.706f, -2.229f, 1.748f, -2.89f, 3.0f)
                close()
            }
        }
        .build()
        return _listMusic!!
    }

private var _listMusic: ImageVector? = null
