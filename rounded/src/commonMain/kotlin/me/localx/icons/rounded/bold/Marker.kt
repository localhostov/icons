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

public val Icons.Bold.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(10.513f, 10.513f, 0.0f, false, false, 1.5f, 10.5f)
                curveToRelative(0.0f, 2.826f, 2.2f, 6.766f, 6.541f, 11.709f)
                arcToRelative(5.275f, 5.275f, 0.0f, false, false, 7.92f, 0.0f)
                curveTo(20.3f, 17.267f, 22.5f, 13.327f, 22.5f, 10.5f)
                arcTo(10.513f, 10.513f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(13.706f, 20.231f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, -3.412f, 0.0f)
                curveToRelative(-3.683f, -4.195f, -5.8f, -7.742f, -5.8f, -9.73f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 15.0f, 0.0f)
                curveTo(19.5f, 12.489f, 17.389f, 16.036f, 13.706f, 20.231f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.055f)
                arcToRelative(4.363f, 4.363f, 0.0f, true, false, 4.363f, 4.363f)
                arcTo(4.368f, 4.368f, 0.0f, false, false, 12.0f, 6.055f)
                close()
                moveTo(12.0f, 11.781f)
                arcToRelative(1.363f, 1.363f, 0.0f, true, true, 1.363f, -1.363f)
                arcTo(1.364f, 1.364f, 0.0f, false, true, 12.0f, 11.781f)
                close()
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
