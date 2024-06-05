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

public val Icons.Bold.Elevator: ImageVector
    get() {
        if (_elevator != null) {
            return _elevator!!
        }
        _elevator = Builder(name = "Elevator", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 6.0f)
                lineTo(5.5f, 6.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 0.816f, -0.393f, 1.542f, -1.0f, 1.999f)
                curveToRelative(0.0f, -1.932f, -1.567f, -3.499f, -3.5f, -3.499f)
                reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.499f, 1.566f, -3.5f, 3.499f)
                curveToRelative(-0.607f, -0.457f, -1.0f, -1.183f, -1.0f, -1.999f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(10.0f, 13.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(19.0f, 13.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(4.502f, 2.677f)
                lineTo(6.952f, 0.227f)
                curveToRelative(0.303f, -0.302f, 0.793f, -0.302f, 1.096f, 0.0f)
                lineToRelative(2.451f, 2.451f)
                curveToRelative(0.488f, 0.488f, 0.142f, 1.323f, -0.548f, 1.323f)
                horizontalLineToRelative(-4.901f)
                curveToRelative(-0.69f, 0.0f, -1.036f, -0.834f, -0.548f, -1.323f)
                close()
                moveTo(13.502f, 1.322f)
                curveToRelative(-0.488f, -0.488f, -0.142f, -1.322f, 0.548f, -1.322f)
                horizontalLineToRelative(4.901f)
                curveToRelative(0.69f, 0.0f, 1.036f, 0.834f, 0.548f, 1.322f)
                lineToRelative(-2.451f, 2.451f)
                curveToRelative(-0.303f, 0.303f, -0.793f, 0.303f, -1.096f, 0.0f)
                lineToRelative(-2.451f, -2.451f)
                close()
            }
        }
        .build()
        return _elevator!!
    }

private var _elevator: ImageVector? = null
