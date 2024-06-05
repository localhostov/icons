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

public val Icons.Bold.FunctionSquare: ImageVector
    get() {
        if (_functionSquare != null) {
            return _functionSquare!!
        }
        _functionSquare = Builder(name = "FunctionSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(12.05f, 6.0f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-0.8f)
                curveToRelative(-0.414f, 0.0f, -0.75f, 0.337f, -0.75f, 0.75f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.3f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-4.3f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.792f, 1.458f, -3.25f, 3.25f, -3.25f)
                horizontalLineToRelative(0.8f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                close()
                moveTo(18.526f, 12.915f)
                lineToRelative(-1.452f, 2.085f)
                lineToRelative(1.452f, 2.085f)
                curveToRelative(0.395f, 0.567f, 0.255f, 1.346f, -0.312f, 1.74f)
                curveToRelative(-0.218f, 0.152f, -0.467f, 0.225f, -0.713f, 0.225f)
                curveToRelative(-0.395f, 0.0f, -0.784f, -0.187f, -1.027f, -0.535f)
                lineToRelative(-0.924f, -1.327f)
                lineToRelative(-0.924f, 1.327f)
                curveToRelative(-0.243f, 0.349f, -0.632f, 0.535f, -1.027f, 0.535f)
                curveToRelative(-0.247f, 0.0f, -0.496f, -0.072f, -0.713f, -0.225f)
                curveToRelative(-0.566f, -0.395f, -0.706f, -1.173f, -0.312f, -1.74f)
                lineToRelative(1.452f, -2.085f)
                lineToRelative(-1.452f, -2.085f)
                curveToRelative(-0.395f, -0.567f, -0.255f, -1.346f, 0.312f, -1.74f)
                curveToRelative(0.566f, -0.396f, 1.345f, -0.256f, 1.74f, 0.311f)
                lineToRelative(0.924f, 1.327f)
                lineToRelative(0.924f, -1.327f)
                curveToRelative(0.395f, -0.565f, 1.174f, -0.706f, 1.74f, -0.311f)
                curveToRelative(0.566f, 0.395f, 0.706f, 1.173f, 0.312f, 1.74f)
                close()
            }
        }
        .build()
        return _functionSquare!!
    }

private var _functionSquare: ImageVector? = null
