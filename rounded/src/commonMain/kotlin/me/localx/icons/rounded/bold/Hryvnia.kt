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

public val Icons.Bold.Hryvnia: ImageVector
    get() {
        if (_hryvnia != null) {
            return _hryvnia!!
        }
        _hryvnia = Builder(name = "Hryvnia", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 16.0f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.966f, 0.0f, -3.0f)
                horizontalLineToRelative(-6.913f)
                lineToRelative(3.87f, -1.478f)
                curveToRelative(0.364f, -0.139f, 0.707f, -0.315f, 1.026f, -0.522f)
                horizontalLineToRelative(2.017f)
                curveToRelative(1.817f, 0.008f, 2.021f, -2.699f, 0.246f, -2.98f)
                curveToRelative(0.808f, -2.463f, -0.349f, -5.296f, -2.653f, -6.503f)
                curveTo(12.279f, -1.793f, 5.478f, 1.018f, 3.395f, 3.486f)
                curveToRelative(-0.558f, 0.608f, -0.517f, 1.549f, 0.088f, 2.109f)
                curveToRelative(0.604f, 0.562f, 1.553f, 0.526f, 2.117f, -0.075f)
                curveToRelative(1.482f, -1.822f, 6.922f, -3.82f, 11.069f, -1.362f)
                curveToRelative(1.396f, 0.703f, 1.765f, 2.69f, 0.731f, 3.842f)
                horizontalLineTo(3.5f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.966f, 0.0f, 3.0f)
                horizontalLineToRelative(6.914f)
                lineToRelative(-3.778f, 1.442f)
                curveToRelative(-0.385f, 0.147f, -0.748f, 0.335f, -1.085f, 0.558f)
                horizontalLineTo(3.5f)
                curveToRelative(-1.831f, -0.006f, -2.016f, 2.728f, -0.221f, 2.984f)
                curveToRelative(-0.887f, 2.58f, 0.396f, 5.637f, 2.841f, 6.798f)
                curveToRelative(5.809f, 2.942f, 13.084f, -0.1f, 15.325f, -2.115f)
                curveToRelative(0.643f, -0.521f, 0.741f, -1.462f, 0.223f, -2.105f)
                curveToRelative(-0.521f, -0.646f, -1.463f, -0.746f, -2.108f, -0.229f)
                curveToRelative(-1.66f, 1.5f, -7.602f, 4.05f, -12.12f, 1.755f)
                curveToRelative(-1.491f, -0.683f, -1.912f, -2.874f, -0.798f, -4.087f)
                horizontalLineToRelative(13.86f)
                close()
            }
        }
        .build()
        return _hryvnia!!
    }

private var _hryvnia: ImageVector? = null
