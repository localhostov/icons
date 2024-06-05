package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ShieldCross: ImageVector
    get() {
        if (_shieldCross != null) {
            return _shieldCross!!
        }
        _shieldCross = Builder(name = "ShieldCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.383f, 2.036f)
                lineTo(12.472f, 0.076f)
                curveToRelative(-0.307f, -0.102f, -0.638f, -0.102f, -0.944f, 0.0f)
                lineToRelative(-5.911f, 1.96f)
                curveToRelative(-2.163f, 0.718f, -3.617f, 2.731f, -3.617f, 5.01f)
                verticalLineToRelative(5.106f)
                curveToRelative(0.0f, 6.518f, 6.852f, 10.45f, 8.952f, 11.5f)
                lineToRelative(0.38f, 0.19f)
                curveToRelative(0.21f, 0.105f, 0.44f, 0.158f, 0.67f, 0.158f)
                curveToRelative(0.19f, 0.0f, 0.38f, -0.036f, 0.56f, -0.108f)
                lineToRelative(0.395f, -0.159f)
                curveToRelative(2.122f, -0.854f, 9.043f, -4.21f, 9.043f, -11.581f)
                verticalLineToRelative(-5.106f)
                curveToRelative(0.0f, -2.279f, -1.454f, -4.293f, -3.617f, -5.01f)
                close()
                moveTo(19.0f, 12.152f)
                curveToRelative(0.0f, 5.259f, -5.032f, 7.896f, -6.932f, 8.702f)
                curveToRelative(-1.926f, -0.998f, -7.068f, -4.098f, -7.068f, -8.702f)
                verticalLineToRelative(-5.106f)
                curveToRelative(0.0f, -0.983f, 0.627f, -1.853f, 1.561f, -2.162f)
                lineToRelative(5.439f, -1.804f)
                lineToRelative(5.439f, 1.804f)
                curveToRelative(0.933f, 0.31f, 1.561f, 1.178f, 1.561f, 2.162f)
                verticalLineToRelative(5.106f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 9.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _shieldCross!!
    }

private var _shieldCross: ImageVector? = null
