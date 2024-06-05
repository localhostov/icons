package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Language: ImageVector
    get() {
        if (_language != null) {
            return _language!!
        }
        _language = Builder(name = "Language", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.986f, 9.4f)
                curveToRelative(-0.038f, 0.0f, -0.071f, 0.026f, -0.079f, 0.063f)
                lineToRelative(-0.811f, 3.437f)
                horizontalLineToRelative(1.757f)
                lineToRelative(-0.787f, -3.437f)
                curveToRelative(-0.009f, -0.037f, -0.041f, -0.063f, -0.079f, -0.063f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                curveTo(1.343f, 4.0f, 0.0f, 5.343f, 0.0f, 7.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(11.0f)
                lineTo(11.0f, 4.0f)
                close()
                moveTo(7.173f, 14.3f)
                horizontalLineToRelative(-2.409f)
                lineToRelative(-0.401f, 1.7f)
                horizontalLineToRelative(-1.437f)
                lineToRelative(1.616f, -6.853f)
                curveToRelative(0.201f, -0.866f, 1.137f, -1.406f, 2.056f, -1.021f)
                curveToRelative(0.439f, 0.184f, 0.734f, 0.606f, 0.842f, 1.07f)
                lineToRelative(1.559f, 6.804f)
                horizontalLineToRelative(-1.437f)
                lineToRelative(-0.389f, -1.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(11.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 10.253f)
                horizontalLineToRelative(-0.932f)
                curveToRelative(-0.121f, 1.275f, -0.617f, 2.731f, -1.607f, 3.866f)
                curveToRelative(0.663f, 0.403f, 1.49f, 0.665f, 2.539f, 0.665f)
                verticalLineToRelative(1.253f)
                curveToRelative(-1.456f, 0.0f, -2.595f, -0.418f, -3.488f, -1.053f)
                curveToRelative(-0.896f, 0.64f, -2.049f, 1.053f, -3.512f, 1.053f)
                verticalLineToRelative(-1.253f)
                curveToRelative(1.049f, 0.0f, 1.881f, -0.258f, 2.545f, -0.661f)
                curveToRelative(-0.554f, -0.636f, -0.957f, -1.372f, -1.223f, -2.123f)
                horizontalLineToRelative(1.336f)
                curveToRelative(0.204f, 0.468f, 0.487f, 0.92f, 0.847f, 1.325f)
                curveToRelative(0.818f, -0.92f, 1.192f, -2.108f, 1.303f, -3.071f)
                horizontalLineToRelative(-4.808f)
                verticalLineToRelative(-1.253f)
                horizontalLineToRelative(2.873f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.253f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.873f)
                verticalLineToRelative(1.253f)
                close()
            }
        }
        .build()
        return _language!!
    }

private var _language: ImageVector? = null
