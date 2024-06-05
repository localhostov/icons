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

public val Icons.Filled.LandLocation: ImageVector
    get() {
        if (_landLocation != null) {
            return _landLocation!!
        }
        _landLocation = Builder(name = "LandLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.949f, 2.05f)
                curveToRelative(-1.321f, -1.322f, -3.079f, -2.05f, -4.949f, -2.05f)
                reflectiveCurveToRelative(-3.627f, 0.728f, -4.95f, 2.05f)
                curveToRelative(-2.729f, 2.729f, -2.729f, 7.17f, 0.008f, 9.907f)
                lineToRelative(4.942f, 4.833f)
                lineToRelative(4.949f, -4.841f)
                curveToRelative(1.322f, -1.322f, 2.051f, -3.08f, 2.051f, -4.95f)
                reflectiveCurveToRelative(-0.729f, -3.627f, -2.051f, -4.95f)
                close()
                moveTo(12.0f, 9.99f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(0.767f, 18.001f)
                lineToRelative(6.351f, 0.01f)
                lineToRelative(-0.751f, 5.989f)
                lineTo(0.0f, 24.0f)
                lineToRelative(0.015f, -1.671f)
                lineToRelative(0.753f, -4.328f)
                close()
                moveTo(7.475f, 15.163f)
                lineToRelative(-0.106f, 0.848f)
                lineToRelative(-6.254f, -0.01f)
                lineToRelative(1.044f, -6.002f)
                horizontalLineToRelative(1.356f)
                curveToRelative(0.443f, 1.257f, 1.168f, 2.411f, 2.145f, 3.388f)
                lineToRelative(1.816f, 1.776f)
                close()
                moveTo(24.0f, 22.499f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6.367f)
                lineToRelative(-0.749f, -5.973f)
                lineToRelative(6.345f, 0.01f)
                lineToRelative(0.771f, 4.463f)
                close()
                moveTo(14.868f, 18.023f)
                lineToRelative(0.75f, 5.976f)
                horizontalLineToRelative(-7.235f)
                lineToRelative(0.751f, -5.985f)
                lineToRelative(1.259f, 0.002f)
                lineToRelative(1.608f, 1.572f)
                lineToRelative(1.602f, -1.567f)
                lineToRelative(1.266f, 0.002f)
                close()
                moveTo(22.884f, 16.036f)
                lineToRelative(-6.251f, -0.01f)
                lineToRelative(-0.108f, -0.864f)
                lineToRelative(1.839f, -1.799f)
                curveToRelative(0.966f, -0.966f, 1.685f, -2.113f, 2.126f, -3.364f)
                horizontalLineToRelative(1.351f)
                lineToRelative(1.043f, 6.036f)
                close()
            }
        }
        .build()
        return _landLocation!!
    }

private var _landLocation: ImageVector? = null
