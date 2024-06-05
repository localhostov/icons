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

public val Icons.Filled.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20.5f, 11.0f)
                curveToRelative(-0.268f, 0.0f, -0.534f, 0.018f, -0.797f, 0.049f)
                lineToRelative(-1.677f, -4.312f)
                curveToRelative(0.289f, 0.163f, 0.619f, 0.263f, 0.974f, 0.263f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.886f, 0.0f, -1.629f, 0.58f, -1.891f, 1.378f)
                lineToRelative(-0.925f, -2.378f)
                horizontalLineToRelative(-5.184f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.816f)
                lineToRelative(2.943f, 7.567f)
                curveToRelative(-0.932f, 0.399f, -1.783f, 0.996f, -2.484f, 1.775f)
                lineToRelative(-2.24f, 2.658f)
                horizontalLineToRelative(-1.158f)
                lineToRelative(-3.2f, -8.0f)
                horizontalLineToRelative(-4.677f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.04f)
                curveToRelative(-0.023f, 0.165f, -0.04f, 0.331f, -0.04f, 0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, -0.016f, -0.335f, -0.04f, -0.5f)
                horizontalLineToRelative(5.005f)
                lineToRelative(2.818f, -3.345f)
                curveToRelative(0.947f, -1.052f, 2.302f, -1.655f, 3.717f, -1.655f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null
