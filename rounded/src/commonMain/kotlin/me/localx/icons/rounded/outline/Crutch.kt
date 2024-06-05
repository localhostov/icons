package me.localx.icons.rounded.outline

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

public val Icons.Outline.Crutch: ImageVector
    get() {
        if (_crutch != null) {
            return _crutch!!
        }
        _crutch = Builder(name = "Crutch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.475f, 8.12f)
                curveToRelative(-0.021f, -0.011f, -2.076f, -1.136f, -4.19f, -3.25f)
                curveToRelative(-2.126f, -2.125f, -3.402f, -4.343f, -3.415f, -4.365f)
                curveToRelative(-0.274f, -0.48f, -0.885f, -0.648f, -1.364f, -0.373f)
                curveToRelative(-0.479f, 0.273f, -0.647f, 0.883f, -0.374f, 1.363f)
                curveToRelative(0.019f, 0.034f, 0.191f, 0.333f, 0.5f, 0.803f)
                lineToRelative(-5.617f, 5.617f)
                curveToRelative(-1.943f, 1.943f, -3.014f, 4.526f, -3.014f, 7.275f)
                verticalLineToRelative(1.395f)
                lineTo(0.293f, 22.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(5.707f, -5.707f)
                horizontalLineToRelative(1.396f)
                curveToRelative(2.748f, 0.0f, 5.332f, -1.07f, 7.275f, -3.014f)
                lineToRelative(5.608f, -5.608f)
                curveToRelative(0.491f, 0.316f, 0.8f, 0.484f, 0.834f, 0.502f)
                curveToRelative(0.15f, 0.081f, 0.312f, 0.12f, 0.473f, 0.12f)
                curveToRelative(0.355f, 0.0f, 0.699f, -0.19f, 0.881f, -0.525f)
                curveToRelative(0.262f, -0.485f, 0.08f, -1.092f, -0.405f, -1.354f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(-0.809f)
                curveToRelative(0.0f, -1.877f, 0.62f, -3.659f, 1.763f, -5.112f)
                lineToRelative(4.159f, 4.158f)
                curveToRelative(-1.453f, 1.143f, -3.235f, 1.763f, -5.112f, 1.763f)
                horizontalLineToRelative(-0.81f)
                close()
                moveTo(15.378f, 12.865f)
                lineToRelative(-4.243f, -4.243f)
                lineToRelative(4.678f, -4.678f)
                curveToRelative(0.56f, 0.72f, 1.25f, 1.532f, 2.058f, 2.339f)
                curveToRelative(0.758f, 0.758f, 1.505f, 1.398f, 2.171f, 1.918f)
                lineToRelative(-4.663f, 4.664f)
                close()
            }
        }
        .build()
        return _crutch!!
    }

private var _crutch: ImageVector? = null
