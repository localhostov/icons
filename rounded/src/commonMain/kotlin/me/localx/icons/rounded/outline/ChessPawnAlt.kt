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

public val Icons.Outline.ChessPawnAlt: ImageVector
    get() {
        if (_chessPawnAlt != null) {
            return _chessPawnAlt!!
        }
        _chessPawnAlt = Builder(name = "ChessPawnAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.052f, 18.0f)
                lineTo(19.0f, 18.0f)
                curveToRelative(-1.988f, 0.0f, -4.0f, -3.435f, -4.0f, -10.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-0.537f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 8.537f, 6.0f)
                lineTo(8.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                curveToRelative(0.0f, 6.565f, -2.012f, 10.0f, -4.0f, 10.0f)
                lineTo(4.948f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 24.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.052f, -6.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 4.464f, 0.883f, 7.96f, 2.4f, 10.0f)
                lineTo(8.6f, 18.0f)
                curveTo(10.117f, 15.96f, 11.0f, 12.464f, 11.0f, 8.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _chessPawnAlt!!
    }

private var _chessPawnAlt: ImageVector? = null
