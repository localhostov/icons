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

public val Icons.Bold.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = Builder(name = "CodeSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.389f, 21.682f)
                lineTo(0.915f, 14.207f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.073f, 0.0f, -4.243f)
                lineTo(8.439f, 2.439f)
                lineToRelative(2.121f, 2.121f)
                lineTo(3.036f, 12.085f)
                lineToRelative(7.475f, 7.475f)
                lineToRelative(-2.121f, 2.121f)
                close()
                moveTo(23.121f, 14.207f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.073f, 0.0f, -4.243f)
                lineTo(15.596f, 2.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(7.525f, 7.525f)
                lineToRelative(-7.475f, 7.475f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(7.475f, -7.475f)
                close()
            }
        }
        .build()
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
