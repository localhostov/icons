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

public val Icons.Bold.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.16f, 11.693f)
                lineToRelative(-0.717f, -0.746f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.12f, -0.042f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.042f, 2.121f)
                lineToRelative(1.159f, 1.206f)
                arcToRelative(2.363f, 2.363f, 0.0f, false, false, 1.674f, 0.74f)
                horizontalLineToRelative(0.037f)
                arcToRelative(2.368f, 2.368f, 0.0f, false, false, 1.662f, -0.688f)
                lineToRelative(3.961f, -3.962f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -2.121f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.609f, -0.129f)
                curveTo(11.0f, 23.7f, 1.909f, 19.569f, 1.909f, 12.0f)
                verticalLineTo(7.247f)
                arcTo(5.492f, 5.492f, 0.0f, false, true, 5.67f, 2.029f)
                lineTo(11.525f, 0.077f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, true, 0.95f, 0.0f)
                lineTo(18.33f, 2.029f)
                arcToRelative(5.493f, 5.493f, 0.0f, false, true, 3.761f, 5.218f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 8.618f, -9.224f, 11.792f, -9.616f, 11.923f)
                arcTo(1.49f, 1.49f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.081f)
                lineTo(6.619f, 4.875f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.71f, 2.372f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 4.735f, 5.421f, 7.952f, 7.168f, 8.865f)
                curveToRelative(1.757f, -0.733f, 7.014f, -3.383f, 7.014f, -8.865f)
                verticalLineTo(7.247f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.71f, -2.372f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
