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

public val Icons.Filled.UtensilsSlash: ImageVector
    get() {
        if (_utensilsSlash != null) {
            return _utensilsSlash!!
        }
        _utensilsSlash = Builder(name = "UtensilsSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 11.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-11.101f)
                curveToRelative(-2.279f, -0.464f, -4.0f, -2.485f, -4.0f, -4.899f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(16.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(23.707f, 22.293f)
                lineToRelative(-4.591f, -4.591f)
                curveToRelative(1.398f, -1.686f, 2.884f, -4.274f, 2.884f, -7.702f)
                curveToRelative(0.0f, -4.167f, -1.821f, -7.755f, -3.513f, -9.325f)
                curveToRelative(-0.661f, -0.614f, -1.585f, -0.793f, -2.356f, -0.458f)
                curveToRelative(-0.698f, 0.304f, -1.131f, 0.987f, -1.131f, 1.783f)
                verticalLineToRelative(11.586f)
                lineToRelative(-3.839f, -3.839f)
                curveToRelative(0.537f, -0.813f, 0.839f, -1.761f, 0.839f, -2.747f)
                lineTo(12.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.45f, -0.112f, 0.885f, -0.302f, 1.284f)
                lineToRelative(-1.698f, -1.698f)
                lineTo(8.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.43f, 0.0f, -0.789f, 0.275f, -0.93f, 0.656f)
                lineToRelative(-0.363f, -0.363f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _utensilsSlash!!
    }

private var _utensilsSlash: ImageVector? = null
