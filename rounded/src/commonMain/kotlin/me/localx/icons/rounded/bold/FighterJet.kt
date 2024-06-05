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

public val Icons.Bold.FighterJet: ImageVector
    get() {
        if (_fighterJet != null) {
            return _fighterJet!!
        }
        _fighterJet = Builder(name = "FighterJet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.842f, 8.079f)
                lineTo(12.466f, 3.0f)
                horizontalLineTo(12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.0f, 3.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.72f)
                lineToRelative(-0.593f, -0.925f)
                curveTo(2.505f, 5.938f, 0.117f, 5.383f, 0.0f, 7.126f)
                verticalLineToRelative(9.748f)
                arcTo(1.126f, 1.126f, 0.0f, false, false, 1.126f, 18.0f)
                horizontalLineToRelative(0.016f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.006f, -1.083f)
                lineTo(3.73f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(4.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 10.5f, 24.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-0.03f)
                lineToRelative(3.373f, -5.054f)
                curveTo(26.769f, 15.3f, 26.773f, 8.692f, 15.842f, 8.079f)
                close()
                moveTo(14.9f, 13.01f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.146f, 0.664f)
                lineTo(10.0f, 19.3f)
                verticalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 9.5f)
                verticalLineTo(4.709f)
                lineToRelative(3.751f, 5.643f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.153f, 0.667f)
                arcTo(22.419f, 22.419f, 0.0f, false, true, 20.42f, 12.0f)
                arcTo(22.5f, 22.5f, 0.0f, false, true, 14.9f, 13.01f)
                close()
            }
        }
        .build()
        return _fighterJet!!
    }

private var _fighterJet: ImageVector? = null
