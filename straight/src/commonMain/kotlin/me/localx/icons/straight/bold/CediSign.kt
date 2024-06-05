package me.localx.icons.straight.bold

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

public val Icons.Bold.CediSign: ImageVector
    get() {
        if (_cediSign != null) {
            return _cediSign!!
        }
        _cediSign = Builder(name = "CediSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.94f)
                verticalLineTo(5.06f)
                curveToRelative(1.74f, 0.26f, 3.26f, 1.35f, 4.06f, 2.97f)
                lineToRelative(2.69f, -1.34f)
                curveToRelative(-1.32f, -2.65f, -3.85f, -4.38f, -6.75f, -4.66f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(2.01f)
                curveToRelative(-4.45f, 0.24f, -8.0f, 3.93f, -8.0f, 8.44f)
                verticalLineToRelative(3.09f)
                curveToRelative(0.0f, 4.51f, 3.55f, 8.2f, 8.0f, 8.44f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.04f)
                curveToRelative(2.84f, -0.28f, 5.36f, -1.96f, 6.69f, -4.54f)
                lineToRelative(-2.67f, -1.38f)
                curveToRelative(-0.81f, 1.57f, -2.31f, 2.63f, -4.02f, 2.89f)
                close()
                moveTo(6.0f, 13.55f)
                verticalLineToRelative(-3.09f)
                curveToRelative(0.0f, -2.85f, 2.2f, -5.2f, 5.0f, -5.43f)
                verticalLineToRelative(13.96f)
                curveToRelative(-2.8f, -0.23f, -5.0f, -2.58f, -5.0f, -5.43f)
                close()
            }
        }
        .build()
        return _cediSign!!
    }

private var _cediSign: ImageVector? = null
