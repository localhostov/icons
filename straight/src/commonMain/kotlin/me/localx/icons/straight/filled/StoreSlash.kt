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

public val Icons.Filled.StoreSlash: ImageVector
    get() {
        if (_storeSlash != null) {
            return _storeSlash!!
        }
        _storeSlash = Builder(name = "StoreSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.94f, 20.52f)
                curveToRelative(0.03f, -0.17f, 0.06f, -0.34f, 0.06f, -0.52f)
                verticalLineToRelative(-4.16f)
                curveToRelative(-1.02f, 0.75f, -2.25f, 1.16f, -3.54f, 1.16f)
                horizontalLineToRelative(-0.04f)
                lineToRelative(-2.78f, -2.78f)
                curveToRelative(0.66f, 0.49f, 1.48f, 0.78f, 2.37f, 0.78f)
                horizontalLineToRelative(0.46f)
                curveToRelative(1.18f, 0.0f, 2.29f, -0.52f, 3.05f, -1.41f)
                reflectiveCurveToRelative(1.09f, -2.08f, 0.89f, -3.24f)
                lineToRelative(-1.56f, -9.34f)
                horizontalLineToRelative(-3.85f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-1.98f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-6.02f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(-0.39f, -0.39f)
                verticalLineTo(1.0f)
                horizontalLineTo(3.15f)
                lineToRelative(-0.11f, 0.63f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(2.6f, 2.6f)
                lineTo(13.33f, 14.75f)
                lineToRelative(1.52f, 1.52f)
                lineToRelative(6.04f, 6.04f)
                lineToRelative(1.65f, 1.65f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.02f, -2.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.06f, 0.0f, -2.1f, -0.28f, -3.0f, -0.81f)
                curveToRelative(-0.9f, 0.52f, -1.94f, 0.81f, -3.0f, 0.81f)
                horizontalLineToRelative(-0.46f)
                curveToRelative(-1.29f, 0.0f, -2.52f, -0.42f, -3.54f, -1.16f)
                verticalLineToRelative(4.16f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(13.76f)
                lineToRelative(-6.05f, -6.05f)
                curveToRelative(-0.23f, 0.03f, -0.47f, 0.05f, -0.71f, 0.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.54f, 15.0f)
                horizontalLineToRelative(0.46f)
                curveToRelative(1.19f, 0.0f, 2.27f, -0.53f, 3.0f, -1.36f)
                verticalLineToRelative(-0.4f)
                lineTo(2.24f, 6.48f)
                lineToRelative(-0.64f, 3.86f)
                curveToRelative(-0.19f, 1.16f, 0.13f, 2.34f, 0.89f, 3.24f)
                reflectiveCurveToRelative(1.87f, 1.41f, 3.05f, 1.41f)
                close()
            }
        }
        .build()
        return _storeSlash!!
    }

private var _storeSlash: ImageVector? = null
