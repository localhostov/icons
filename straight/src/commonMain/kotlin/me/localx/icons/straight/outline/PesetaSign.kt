package me.localx.icons.straight.outline

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

public val Icons.Outline.PesetaSign: ImageVector
    get() {
        if (_pesetaSign != null) {
            return _pesetaSign!!
        }
        _pesetaSign = Builder(name = "PesetaSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(-0.49f, -3.94f, -3.86f, -7.0f, -7.93f, -7.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                lineTo(4.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(4.07f, 0.0f, 7.44f, -3.06f, 7.93f, -7.0f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.97f, 0.0f, 5.43f, 2.17f, 5.91f, 5.0f)
                lineTo(6.0f, 7.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(12.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(11.91f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5.0f, -5.91f, 5.0f)
                close()
            }
        }
        .build()
        return _pesetaSign!!
    }

private var _pesetaSign: ImageVector? = null
